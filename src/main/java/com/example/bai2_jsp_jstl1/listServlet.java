package com.example.bai2_jsp_jstl1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "listServlet", value = "")
public class listServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Member> listMember = new ArrayList<>();
        listMember.add(new Member("Vũ Duy Khánh", "14-02-2004", "Hà Nội", "https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
        listMember.add(new Member("Vũ Duy Khánh", "14-02-2004", "Hà Nội", "https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
        listMember.add(new Member("Vũ Duy Khánh", "14-02-2004", "Hà Nội", "https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
        listMember.add(new Member("Vũ Duy Khánh", "14-02-2004", "Hà Nội", "https://scontent.fhan14-2.fna.fbcdn.net/v/t39.30808-6/278350136_3202481560034861_1126502291344656219_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=1b51e3&_nc_ohc=5LZqKJrGFJsAX-dyZd1&_nc_ht=scontent.fhan14-2.fna&oh=00_AfCo-hYFunb-HtxH_jVyNY1eGMkreQB4ucOd_BDR_C1Aiw&oe=6507E07E"));
        req.setAttribute("Member", listMember);
    }
}
