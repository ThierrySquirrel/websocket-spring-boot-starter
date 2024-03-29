/**
 * Copyright 2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.thierrysquirrel.websocket.init.core.factory;

import com.github.thierrysquirrel.websocket.core.container.WebsocketRouteContainer;
import com.github.thierrysquirrel.websocket.core.template.WebsocketRouteTemplate;
import com.github.thierrysquirrel.websocket.core.template.core.factory.WebsocketRouteTemplateFactory;

/**
 * ClassName: WebsocketRouteInitFactory
 * Description:
 * date: 2020/8/17 22:56
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
public class WebsocketRouteInitFactory {
    private WebsocketRouteInitFactory() {
    }

    public static void addWebsocketRouteTemplate(WebsocketRouteTemplate routeTemplate) {
        String route = WebsocketRouteTemplateFactory.getRoute (routeTemplate);
        WebsocketRouteContainer.putWebsocketRouteTemplate (route, routeTemplate);
    }
}
