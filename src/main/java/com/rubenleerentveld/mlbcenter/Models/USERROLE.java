package com.rubenleerentveld.mlbcenter.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class USERROLE {
    @Id
    int userId;

    int roleId;
}
