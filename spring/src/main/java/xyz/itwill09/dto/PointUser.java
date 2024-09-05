package xyz.itwill09.dto;

import lombok.Builder;
import lombok.Data;

//create table point_user(id varchar2(20) primary key, name varchar2(30), point number);

/*
이름    널?       유형           
----- -------- ------------ 
ID    NOT NULL VARCHAR2(20) 
NAME           VARCHAR2(30) 
POINT          NUMBER       
 */

@Data
@Builder
public class PointUser {
	private String id;
	private String name;
	private int point;
}
