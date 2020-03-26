package servlets;



import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;


import javax.servlet.Servlet;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

@Component
        (service = Servlet.class,
                property = {
                "sling.servlet.paths=/libs/myweb"
        }

        )
public class ServletByPath extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
//        response.getWriter().print("this is a nw servlrt....");
        ResourceResolver resourceResolver = request.getResourceResolver();

        Iterable<Resource> child= resourceResolver.getResource("/content/devices").getChildren();

        List<ValueMap> childList = new ArrayList<ValueMap>();
        for(Resource resource : child){
            ValueMap valueChild = resource.getValueMap();
            childList.add(valueChild);
        }

        for (ValueMap valueMap:childList){
            response.getWriter().print(valueMap);
        }

        }
}
