package com.santhosh.chatapp;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.santhosh.datalayer.DatabaseManager;

public class HeaderAction extends ActionSupport {


    private static int loginUserId;
    private String search;
    private boolean s=false;
    
    static private List<UserWithResponse> searchResults;
   
    public boolean isStart() {
    	return s;
    }
    
	public String execute() {
		System.out.println("inside header");
        setLoginUserId(new LoginAction().getLoginUserId());
        if (search != null) {
        	s=true;
            System.out.println(loginUserId + "loginUserId");
            searchResults = DatabaseManager.getInstance().searchFriends(search, loginUserId);
            System.out.println(searchResults);
            if(searchResults.isEmpty()) {
            	System.out.println("oiii");
            	return ERROR;
            }
            System.out.println(searchResults.size() + ".....");
            return SUCCESS;
        } else {
            return ERROR;
        }
    }


    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public List<UserWithResponse> getSearchResults() {
        return searchResults;
    }

    public int getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(int loginUserId) {
        this.loginUserId = loginUserId;
    }
}
