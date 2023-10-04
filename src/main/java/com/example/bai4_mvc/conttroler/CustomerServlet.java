package com.example.bai4_mvc.conttroler;

import com.example.bai4_mvc.model.Customer;
import com.example.bai4_mvc.service.CustomerServiceImpl;
import com.example.bai4_mvc.service.ICustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private final ICustomerService customerServlet = new CustomerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                updateCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            default:
                break;
        }
    }
    private void createCustomer(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id =(int) (Math.random() * 1000);

        Customer customer = new Customer(id,name,email,address);
        this.customerServlet.save(customer);
        try {
            request.getRequestDispatcher("customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("message","New customer was created");
    }
    // Phương thức xóa customer dựa theo id.
    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response){
        int id =  Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerServlet.findById(id);
        if (customer == null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            this.customerServlet.remove(id);
            try {
                response.sendRedirect("/customers");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerServlet.findById(id);
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        if (customer == null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            customer.setName(name);
            customer.setName(email);
            customer.setName(address);
            this.customerServlet.update(id,customer);
            request.setAttribute("customer", customer);
            request.setAttribute("message", "Customer information was update");
            try {
                request.getRequestDispatcher("customer/edit.jsp").forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "view":
                viewCustomer(request, response);
                break;
            default:
                listCustomers(request, response);
                break;
        }
    }

    //Show danh sach
    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = this.customerServlet.findAll();
        request.setAttribute("customers", customers);
        try {
            request.getRequestDispatcher("customer/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức trả về trang create.jsp để tạo customer.
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("customer/create.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerServlet.findById(id);
        if (customer == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("customer", customer);
            try {
                request.getRequestDispatcher("customer/edit.jsp").forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    // Phương thức trả về trang delete.jsp để hiển thị customer để xóa.
    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerServlet.findById(id);
        if (customer == null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customer", customer);
            try {
                request.getRequestDispatcher("customer/delete.jsp").forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void viewCustomer(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerServlet.findById(id);
        if(customer == null){
            request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customer", customer);
            try {
                request.getRequestDispatcher("customer/view.jsp").forward(request,response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
