package me.study.designpatterns.behavioral.chain_of_responsibility.examples.example3_filtering_access.middleware;

import me.study.designpatterns.behavioral.chain_of_responsibility.examples.example3_filtering_access.server.Server;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        System.out.println("UserExistsMiddleware:User Exists!");
        return checkNext(email, password);
    }
}