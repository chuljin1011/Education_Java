<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>간단한 지도 표시하기</title>
    
    
</head>
<body>
<div id="map" style="width:100%;height:400px;"></div>

<script type="text/javascript" src="https://oapi.map.naver.com/openapi/v3/maps.js?ncpClientId=wp6i2scvaj"></script>

<script type="text/javascript">
    var mapOptions = {
        center: new naver.maps.LatLng(37.5665, 126.9780), // 초기 지도의 중심 좌표 설정
        zoom: 15 // 초기 지도의 줌 레벨 설정
    };

    var map = new naver.maps.Map('map', mapOptions); // 'map'은 HTML 요소의 id

    // 마커 추가 예제
    var markerOptions = {
        position: new naver.maps.LatLng(37.5665, 126.9780), // 마커의 위치 좌표 설정
        map: map // 마커가 표시될 지도 객체 설정
    };

    var marker = new naver.maps.Marker(markerOptions);

</script>

</body>
</html>