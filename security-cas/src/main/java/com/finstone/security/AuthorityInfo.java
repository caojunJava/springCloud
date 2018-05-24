package com.finstone.security;

/**
 * @author caojun
 * @time 2018/3/14 10:32
 * @description
 */
public class AuthorityInfo {

    private static final long serialVersionUID = -175781100474818800L;

    /**
     * 权限CODE
     */
    private String authority;

    public AuthorityInfo(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
