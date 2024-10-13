<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>카톡 스타일 채팅</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #e6ecf0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .chat-container {
            width: 400px;   /* 고정된 너비 */
            height: 800px;  /* 고정된 높이 */
            background-color: #f4f4f9;
            border-radius: 10px;
            overflow-y: auto;  /* 내용이 넘칠 경우 스크롤 가능하게 설정 */
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }
        .message {
            display: flex;
            margin-bottom: 15px;
        }
        .message.sent {
            justify-content: flex-end;
        }
        .message .bubble {
            max-width: 60%;
            padding: 10px 15px;
            border-radius: 10px;
            font-size: 14px;
            position: relative;
        }
        .message.received .bubble {
            background-color: #ffffff;
            border: 1px solid #d3d3d3;
        }
        .message.sent .bubble {
            background-color: #ffd600;
            color: #333;
            border: 1px solid #ffd600;
        }
        .message .bubble::before {
            content: '';
            position: absolute;
            bottom: 0;
            width: 0;
            height: 0;
        }
        .message.received .bubble::before {
            left: -10px;
            border-top: 10px solid #ffffff;
            border-right: 10px solid transparent;
        }
        .message.sent .bubble::before {
            right: -10px;
            border-top: 10px solid #ffd600;
            border-left: 10px solid transparent;
        }
        .time {
            font-size: 12px;
            color: #999;
            margin-top: 5px;
        }
    </style>
</head>
<body>

    <div class="chat-container">
        <!-- 상대방 메시지 -->
        <div class="message received">
            <div class="bubble">ㅋㅋㅋㅋ</div>
        </div>
        <div class="message received">
            <div class="bubble">생일맞이 틀린거야 뭐야</div>
        </div>
        <div class="message received">
            <div class="bubble">ㅋㅋㅋㅋ</div>
            <div class="time">오후 3:35</div>
        </div>
        <!-- 내가 보낸 메시지 -->
        <div class="message sent">
            <div class="bubble">아니 출석이벤트</div>
        </div>
        <div class="message sent">
            <div class="bubble">강보권 재시도권좀</div>
            <div class="time">오후 3:46</div>
        </div>
        <div class="message received">
            <div class="bubble">이따 고?</div>
            <div class="time">오후 5:08</div>
        </div>
        <div class="message sent">
            <div class="bubble">언제든</div>
            <div class="time">오후 5:08</div>
        </div>
    </div>

</body>
</html>