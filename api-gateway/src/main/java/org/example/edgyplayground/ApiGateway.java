package org.example.edgyplayground;

import org.acme.edgy.runtime.api.Origin;
import org.acme.edgy.runtime.api.PathMode;
import org.acme.edgy.runtime.api.Route;
import org.acme.edgy.runtime.api.RoutingConfiguration;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
class ApiGateway {
    @Produces
    RoutingConfiguration routing() {
        return new RoutingConfiguration()
                .addRoute(new Route("/first", Origin.of("http://localhost:8081/api/resource"), PathMode.FIXED))
                .addRoute(new Route("/second", Origin.of("http://localhost:8082/api/resource"), PathMode.FIXED))
                .addRoute(new Route("/third", Origin.of("http://localhost:8083/third/api/unique"), PathMode.FIXED));
    }

}
