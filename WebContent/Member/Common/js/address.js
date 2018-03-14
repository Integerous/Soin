window.addEventListener("load", function () {

    var cat01 = document.getElementById("cat01");
    var cat02 = document.getElementById("cat02");
    var cat03 = document.getElementById("cat03");

    cat01.onchange = function(evt1) {
    	
    	if(cat03.querySelectorAll("option").length != 0)
    	{
    		var optDs = cat03.querySelectorAll("option");
    		for(var i=0; i<optDs.length; i++)
    		{
    			cat03.removeChild(optDs[i]);
    		}
    		
    		 var opt03t = document.createElement("option");
             opt03t.textContent = "소분류 선택";
             opt03t.value="null";
             cat03.appendChild(opt03t);
    	}
    	
        if(cat01.value == '01')
        {          
            var sec01 = ['강남구', '강동구', '강북구', '강서구', '관악구', '광진구', '구로구', '금천구', '노원구'];
        }
        else if(cat01.value == '02')
        {
            var sec01 = ['도봉구', '동대문구', '동작구', '마포구', '서대문구', '서초구', '성동구', '성북구', '송파구'];      
        }
        else if(cat01.value == '03')
        {
            var sec01 = ['양천구', '영등포구', '용산구', '은평구', '종로구', '중구', '중랑구'];   
        }
        else 
        {
            alert("선택할 수 없는 값입니다.");
            evt1.preventDefault();
        }

        if(cat02.querySelectorAll("option").length != 0)
        {
            var optD = cat02.querySelectorAll("option");
            for(var i=0; i<optD.length; i++)
            {
                cat02.removeChild(optD[i]);
            }
           
            var opt02t = document.createElement("option");
            opt02t.textContent = "중분류 선택";
            cat02.appendChild(opt02t);
        }

        for(var i=0; i<sec01.length; i++)
        {
            var opt02 = document.createElement("option");
            opt02.value = sec01[i];
            opt02.textContent = sec01[i];
            cat02.appendChild(opt02);
        }
        
        cat02.onchange = function(evt2) {

        	if(cat03.querySelectorAll("option").length != 0)
        	{
        		var optDs = cat03.querySelectorAll("option");
        		for(var i=0; i<optDs.length; i++)
        		{
        			cat03.removeChild(optDs[i]);
        		}
        		
        		 var opt03t = document.createElement("option");
                 opt03t.textContent = "소분류 선택";
                 opt03t.value="null";
                 cat03.appendChild(opt03t);
        	}
        	
            if(cat01.value == '01')
            {
                if(cat02.value == '강남구') var sec02 = ['개포동','논현동','대치동','도곡동','삼성동','세곡동','수서동','신사동','압구정동','역삼동','일원동','청담동'];
                else if(cat02.value == '강동구') var sec02 = ['강일동','고덕동','길동','둔촌동','명일동','상일동','성내동','암사동','천호동'];
                else if(cat02.value == '강북구') var sec02 = ['미아동','변제동','삼각산동','삼양동','송중동','송천동','수유동','우이동','인수동'];
                else if(cat02.value == '강서구') var sec02 = ['가양동','공항동','등촌동','발산동','방화동','염창동','우장산동','화곡동','인수동'];
                else if(cat02.value == '관악구') var sec02 = ['낙성대동','난곡동','난향동','남현동','대학동','미성동','보라매동','삼성동','서림동','서원동','성현동','신림동','신사동','신원동','은천동','인헌동','조원동','중앙동','청룡동','청림동','행운동'];
                else if(cat02.value == '광진구') var sec02 = ['광장동','구의동','군자동','능동','자양동','중곡동','화양동'];
                else if(cat02.value == '구로구') var sec02 = ['가리봉동','개봉동','고척동','구로동','수궁동','신도림동','오류동'];  
                else if(cat02.value == '금천구') var sec02 = ['가산동','독산동','시흥동'];
                else if(cat02.value == '노원구') var sec02 = ['공릉동','상계동','월계동','중계동','하계동'];
                else
                {
	                alert("선택할 수 없는 값입니다.");
	                evt2.preventDefault();
                }
            }
            else if(cat01.value == '02')
            {
                if(cat02.value == '도봉구') var sec02 = ['도봉동','방학동','쌍문동','창동'];
                else if(cat02.value == '동대문구') var sec02 = ['답십리동','용신동','이문제동','장안동','전농동','제기동','청량리동','회기동','휘경동'];
                else if(cat02.value == '동작구') var sec02 = ['노량진동','대방동','사당동','상도동','신대방동'];
                else if(cat02.value == '마포구') var sec02 = ['공덕동','대흥동','도화동','망원동','상암동','서강동','서교동','성산동','신수동','아현동','연남동','염리동','용강동'];
                else if(cat02.value == '서대문구') var sec02 = ['남가좌동','북가좌동','북아현동','신촌동','연희동','천연동','충현동','홍은동'];   
                else if(cat02.value == '서초구') var sec02 = ['내곡동','반포동','방배동','서초동','양재동','잠원동'];
                else if(cat02.value == '성동구') var sec02 = ['금호동','마장동','사근동','성수동','송정동','옥수동','왕십리동','용답동','응봉동','행당동'];
                else if(cat02.value == '성북구') var sec02 = ['길음동','돈암동','동선동','보문동','삼선동','석관동','성북동','안암동','월곡동','장위동','정릉동','종암동'];  
                else if(cat02.value == '송파구') var sec02 = ['가락동','거여동','마천동','문정동','방이동','삼전동','석촌동','송파동','오금동','오륜동','위례동','잠실동','장지동','풍납동'];
                else
                {
	                alert("선택할 수 없는 값입니다.");
	                evt2.preventDefault();
                }
            }
            else if(cat01.value == '03')
            {
                if(cat02.value == '양천구') var sec02 = ['목동','신월동','신정동'];
                else if(cat02.value == '영등포구') var sec02 = ['당산동','대림동','도림동','문래동','신길동','양평동','여의동','영등포동'];
                else if(cat02.value == '용산구') var sec02 = ['남영동','보광동','서빙고동','용문동','원효로동','이촌동','이태원동','청파동','한강로동','한남동','효창동','후암동'];
                else if(cat02.value == '은평구') var sec02 = ['갈현동','구산동','녹번동','대조동','불광동','수색동','신사동','역촌동','응암동','증산동','진관동'];
                else if(cat02.value == '종로구') var sec02 = ['가회동','교남동','무악동','부암동','사직동','삼청동','숭인동','이화동','종로동','창신동','청운효자동','평창동','혜화동'];
                else if(cat02.value == '중구') var sec02 = ['광희동','다산동','동화동','명동','소공동','신당동','약수동','을지로동','장충동','중림동','청구동','필동','황학동','회현동'];  
                else if(cat02.value == '중랑구') var sec02 = ['망우동','면목동','묵제동','상봉동','신내동','중화동'];
                else
                {
	                alert("선택할 수 없는 값입니다.");
	                evt2.preventDefault();
                }
            }

            
            for(var j=0; j<sec02.length; j++)
            {
                var opt03 = document.createElement("option");
                opt03.value = sec02[j];
                opt03.textContent = sec02[j];
                cat03.appendChild(opt03);
            }

        };
        
    };

});