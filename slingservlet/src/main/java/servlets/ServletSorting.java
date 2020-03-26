package servlets;


import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.*;

@Component
        (service = Servlet.class,
                property = {
                        "sling.servlet.paths=/libs/my"
                }

        )
public class ServletSorting extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
//           response.getWriter().print("second");

        Resource resource = request.getResourceResolver().getResource("/content/devices/Laptop");
        Resource resource1 = request.getResourceResolver().getResource("/content/devices/Mobile");

        Node node = null;
        Node node1 = null;
        String result_laptop ="" ;
        String result_laptop2 = "";
        String result_mobile = "";
        String result_mobile2 = "";
        node = resource.adaptTo(Node.class);
        node1 = resource1.adaptTo(Node.class);
        try {

            result_laptop =  node.getProperty("jcr:created").getValue().getString();
            result_laptop2 = node.getName();

            result_mobile = node1.getProperty("jcr:created").getValue().getString();
            result_mobile2 = node1.getName();


        } catch (RepositoryException e) {
            e.printStackTrace();
        }
//        response.getWriter().println(result_laptop);
//        response.getWriter().println(result_laptop2);
//        response.getWriter().println(result_mobile);
//        response.getWriter().println(result_mobile2);

        List<Device> device = new ArrayList<Device>();
        device.add(new Device(result_laptop2,result_laptop));
        device.add(new Device(result_mobile2,result_mobile));

        response.getWriter().println(device);



    }
}
