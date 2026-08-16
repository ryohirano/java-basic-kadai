package com.example.springtutorial2.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;


import com.example.springtutorial2.entity.User;
import com.example.springtutorial2.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // 依存性の注入（DI）を行う（コンストラクタインジェクション）
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // 新規ユーザーの登録メソッド
    public void createUser(String userName, String password, int roleId) {
        // ユーザー名の未入力チェック（空欄はNG）
        if (userName == null || userName.isEmpty()) {
            throw new IllegalArgumentException("ユーザー名を入力してください。");
        }

        // ユーザー名の重複チェック（完全一致はNG）
        if (!userRepository.findByUserName(userName).isEmpty()) {
            throw new IllegalArgumentException("そのユーザー名は既に使用されています。");
        }

        // ユーザー登録用のエンティティを作成
        User user = new User();
        user.setUserName(userName);

        String encodedPassword = passwordEncoder.encode(password);
        user.setPassword(encodedPassword);

        user.setRoleId(roleId);


        // ユーザーの登録
        userRepository.save(user);
    }

    // ユーザーの一括取得メソッド
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}