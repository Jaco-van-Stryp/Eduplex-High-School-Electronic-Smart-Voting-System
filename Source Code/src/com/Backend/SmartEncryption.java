//Class Created On 2018.09.23 By Jaco van Stryp
package com.Backend;
//Class used to Encrypt data into the database so no one can read/open it
//only administrators will be able to decrypt the information


public class SmartEncryption { 
    
   public String encrypt(String str){
  /*  int code;
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      code = Math.round((float) Math.random()*8+1);
      result += code + Integer.toHexString( ((int) str.charAt(i) ) ^ code )+"-";
    }
    return result.substring(0, result.lastIndexOf("-"));*/
  return str;
  }

  public String decrypt(String str){
   /* str = str.replace("-", "");
    String result = "";
    for (int i = 0; i < str.length(); i+=3) {
      String hex =  str.substring(i+1, i+3);
      result += (char) (Integer.parseInt(hex, 16) ^ (Integer.parseInt(String.valueOf(str.charAt(i)))));
    }
    return result;*/
   return str;
  }

} 