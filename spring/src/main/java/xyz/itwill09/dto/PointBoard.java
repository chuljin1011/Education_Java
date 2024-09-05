package xyz.itwill09.dto;

import lombok.Builder;
import lombok.Data;

//create table point_board(num number primary key, writer varchar2(20), content varchar2(100));
//create sequence point_baord_seq;

/*
이름      널?       유형            
------- -------- ------------- 
NUM     NOT NULL NUMBER        
WRITER           VARCHAR2(20)  
CONTENT          VARCHAR2(100) 
 */

@Data
@Builder
public class PointBoard {
	private int num;
	private String writer;
	private String content;
}
