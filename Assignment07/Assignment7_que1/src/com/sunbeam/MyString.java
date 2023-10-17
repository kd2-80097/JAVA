package com.sunbeam;

import java.util.Objects;

public class MyString {
	
	 private String value;

	    public MyString(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }


	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        MyString other = (MyString) obj;
	        return Objects.equals(this.value, other.value);
	    }
	    
	    @Override
	    public int hashCode() {
	        return value.hashCode();
	    }

}
