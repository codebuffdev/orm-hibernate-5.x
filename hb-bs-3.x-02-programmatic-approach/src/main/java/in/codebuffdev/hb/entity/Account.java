package in.codebuffdev.hb.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    protected int accountNo;
    protected String accountHolderName;
    protected String accountType;
    protected String mobileNo;
    protected String emailAddress;
    protected Long balance;
}
