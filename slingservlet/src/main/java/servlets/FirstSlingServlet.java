package servlets;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;

//import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
//import org.apache.sling.api.resource.ValueMap;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
@Component(
        immediate = true,
        service = Servlet.class,
        property = {
                "sling.servlet.resourceTypes=blog1"
        }
)

public class FirstSlingServlet extends SlingSafeMethodsServlet {

        @Override
        protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
//                response.getWriter().print("hi servlet with resource path...");
                ResourceResolver resourceResolver = request.getResourceResolver();
                response.setContentType("text/plain");
                response.getWriter().write("Title = " + resourceResolver.getResource("/content/Technical.html").getPath());





        }
}

