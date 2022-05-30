package com.rubenleerentveld.mlbcenter.Repository;

import com.rubenleerentveld.mlbcenter.Models.UserTOTP;
import com.warrenstrange.googleauth.ICredentialRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CredentialRepository  implements ICredentialRepository {

    private final Map<String, UserTOTP> userKeys = new HashMap<String, UserTOTP>();

    @Override
    public String getSecretKey(String userName){
        return userKeys.get(userName).getSecretKey();
    }

    @Override
    public void saveUserCredentials(String userName, String secretKey, int validationCode, List<Integer> scratchCodes){
        userKeys.put(userName, new UserTOTP(userName, secretKey, validationCode, scratchCodes));
    }

    public UserTOTP getUser(String username){
        return userKeys.get(username);
    }


}
