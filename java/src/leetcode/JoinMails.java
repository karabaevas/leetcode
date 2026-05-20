package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JoinMails {
    Map<Integer, Integer> parents = new HashMap<>();
    Map<String, Integer> mailToUser = new HashMap<>();

    public Map<Integer, List<String>> join(Map<Integer, List<String>> users) {
        for (int userId : users.keySet()) {
            parents.put(userId, userId);
        }

        for (Map.Entry<Integer, List<String>> entry : users.entrySet()) {
            Integer user = entry.getKey();
            List<String> mails = entry.getValue();

            for (String mail : mails) {
                Integer owner = mailToUser.get(mail);
                if (owner == null) {
                    mailToUser.put(mail, user);
                } else {
                    union(owner, user);
                }
            }
        }

        Map<Integer, List<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mailToUser.entrySet()) {
            String mail = entry.getKey();
            Integer userId = entry.getValue();

            int key = find(userId);
            List<String> mails =  result.getOrDefault(key, new ArrayList());
            mails.add(mail);
            result.put(key, mails);
        }

        return result;
    }

    int find(int userId){
        Integer parentId = parents.get(userId);
        if(parentId != userId){
            parentId = find(parentId);
            parents.put(userId, parentId);
        }
        return parentId;
    }

     void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        if(rootA != rootB){
            parents.put(rootA, rootB);
        }
    }



}
