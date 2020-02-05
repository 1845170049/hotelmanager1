package com.newer.mapper;

import com.newer.domain.Checkins;
import org.apache.ibatis.annotations.Insert;

public interface CheckinsMapper {
    @Insert("insert into checkins values(null,#{name},#{gender},#{cardtype},#{cardno}," +
            "#{roomid},#{num},null,1,now(),null)")
    int addCheckins(Checkins checkins);

}
