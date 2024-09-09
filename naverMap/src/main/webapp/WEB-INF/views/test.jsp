<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>간단한 지도 표시하기</title>
    
    <script type="text/javascript" src="https://oapi.map.naver.com/openapi/v3/maps.js?ncpClientId=wp6i2scvaj"></script>
    
</head>
<body>
<div id="map" style="width:100%;height:400px;"></div>

<button id="cadastralOn">지적도 켜기</button>
<button id="cadastralOff">지적도 끄기</button>

</body>

<button id="cadastralOn">지적도 켜기</button>
<button id="cadastralOff">지적도 끄기</button>



<script type="text/javascript">
function getCoordinates(address) {
	  return new Promise((resolve, reject) => {
	    naver.maps.Service.geocode({
	      query: address
	    }, function(status, response) {
	      if (status !== naver.maps.Service.Status.OK) {
	        return reject(new Error('주소를 찾을 수 없거나 오류가 발생했습니다.'));
	      }
	      var result = response.v2;
	      var items = result.addresses;
	      if (items.length > 0) {
	        resolve({ latitude: items[0].y, longitude: items[0].x });
	      } else {
	        reject(new Error('주소에 해당하는 좌표 정보를 찾을 수 없습니다.'));
	      }
	    });
	  });
	}

	async function main () {
	  try {
	    const address = '불정로 6';
	    const coordinates = await getCoordinates(address);
	    console.log(coordinates); // { latitude: 위도, longitude: 경도 }
	  } catch (error) {
	    console.error(error.message);
	}
}

main();

const map = new naver.maps.Map(document.getElementById('map'), {
	  center: new naver.maps.LatLng(coordinates.latitude, coordinates.longitude)
	});
	
const map = new naver.maps.Map(document.getElementById('map'), {
	  mapTypeControl: true,
	  mapTypeControlOptions: {
	    style: naver.maps.MapTypeControlStyle.DROPDOWN
	  }
	});

const cadastralOn = document.getElementById('cadastralOn');
const cadastralOff = document.getElementById('cadastralOff');

const cadastralLayer = new naver.maps.CadastralLayer();

cadastralOn.addEventListener('click', event => {
  cadastralLayer.setMap(map);
});

cadastralOff.addEventListener('click', event => {
  cadastralLayer.setMap(null);
});

const map = new naver.maps.Map(document.getElementById('map'), {
	  zoom: 17
	});

const marker = new naver.maps.Marker({
	  position: new naver.maps.LatLng(coordinates.latitude, coordinates.longitude),
	  map: map
	});

</script>








</html>