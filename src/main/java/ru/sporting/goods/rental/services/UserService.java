package ru.sporting.goods.rental.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sporting.goods.rental.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


}
