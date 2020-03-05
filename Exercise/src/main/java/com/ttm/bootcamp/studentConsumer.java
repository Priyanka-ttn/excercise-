package com.ttm.bootcamp;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class studentConsumer {
   @Reference
   Service2 Service2;

}
