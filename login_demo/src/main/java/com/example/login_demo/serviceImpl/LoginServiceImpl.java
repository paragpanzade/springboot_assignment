package com.example.login_demo.serviceImpl;

import com.example.login_demo.entity.Login;
import com.example.login_demo.repository.LoginRepository;
import com.example.login_demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepository login_repo;
    @Override
    public Login createUser(String pass, Login login) {
        String encodedPass = getEncodedPass(pass);
        login.setPassword(encodedPass);
        return login_repo.save(login);
    }

    @Override
    public String isUser(String pass) {
        String result = "";
        List<Login> userList = login_repo.findAll();
        List<String> passList = userList.stream().map(Login::getPassword).collect(Collectors.toList());
        for (String curr_pass : passList){
            String decodedPass = getDecodedPass(curr_pass);
            if (pass.equals(decodedPass)){
                result = "Found!";
            }
            else {
                continue;
            }
        }
        if (!result.isEmpty())
            return result;
        else
            return "User Not Found!";
    }

    public String getEncodedPass(String pass){
        String encodedPass = "";
        for (char ch : pass.toCharArray()){
            int asciiVal = ch + 1;
            char newCh = (char) asciiVal;
            encodedPass = encodedPass + newCh;
        }
        return encodedPass;
    }

    public String getDecodedPass(String encodedPass){
        String decodedPass = "";
        for (char ch : encodedPass.toCharArray()){
            int asciiVal = ch - 1;
            char newCh = (char) asciiVal;
            decodedPass = decodedPass + newCh;
        }
        return decodedPass;
    }
}
