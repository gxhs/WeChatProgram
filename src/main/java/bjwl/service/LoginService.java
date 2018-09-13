package bjwl.service;

import bjwl.pojo.Loginstate;

import java.util.List;

public interface LoginService {

   int insert(Loginstate loginstate);
   int updateByKey(Loginstate loginstate);
   int selectByResession(String re);
   Loginstate selectByKey(String id);
   List<Loginstate> selectOpenIdByRe(String re);
}
