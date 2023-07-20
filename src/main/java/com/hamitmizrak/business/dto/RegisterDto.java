package com.hamitmizrak.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDto implements Serializable {

    public final static long serialVersionUID=1L;

    private Long id;
    private String username;
    private String emailAddress;
    private String password;
    private Date createdDate=new Date(System.currentTimeMillis());
}
