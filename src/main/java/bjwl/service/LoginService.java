package bjwl.service;

import bjwl.pojo.Loginstate;

public interface LoginService {

   int insert(Loginstate loginstate);
   int updateByKey(Loginstate loginstate);
   int selectByResession(String re);
}
