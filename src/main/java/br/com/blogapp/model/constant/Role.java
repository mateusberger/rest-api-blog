package br.com.blogapp.model.constant;

import br.com.blogapp.model.persistable.User;

import javax.persistence.MappedSuperclass;

public enum Role {

    ADMIN, AUTHOR, EDITOR, NEW_USER;

}
