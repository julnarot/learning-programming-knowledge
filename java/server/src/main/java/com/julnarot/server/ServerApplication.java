package com.julnarot.server;

import com.julnarot.server.enumeration.Status;
import com.julnarot.server.model.Server;
import com.julnarot.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(new Server(null, "192.168.1.2", "Elementary os", "Mi personal note", "http://localhost:8080/server/image/server1.png", "16 GB", Status.SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.12", "Ubuntu", "office computer", "http://localhost:8080/server/image/server2.png", "20 GB", Status.SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.14", "Debian Jessie", "main terminal", "http://localhost:8080/server/image/server3.png", "29 GB", Status.SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.13", "Archi Linux", "jobs executer", "http://localhost:8080/server/image/server4.png", "30 GB", Status.SERVER_DOWN));
        };
    }
}
