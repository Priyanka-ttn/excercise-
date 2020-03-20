package servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
//import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
@Component(
        immediate = true,
        service = Servlet.class,
        property = {
                "sling.servlet.paths=" + "/bin/servlet"

        }
)

public class SecondSlingServlet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("hi servlet 2 with resource path...");
        ResourceResolver resourceResolver = request.getResourceResolver();
        response.getWriter().write("Title = " + resourceResolver.getResource("/content/Technical.html/jcr:content"));


    }
}

