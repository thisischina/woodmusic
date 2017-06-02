//歌曲搜索处理
$(window).load(
	function() {
		var $searchNode = $('#header .search'),
			$searchHintNode = $searchNode.find('.searchHint')[0],
			$searchText = $searchNode.find('.searchText')[0];
		$($searchHintNode).click(function() {
			$(this).hide();
			$($searchText).show()
				.focus();
		});
		$($searchText).blur(function(){
			$(this).hide();
			$($searchHintNode).show();
		});
	}
);
//登录处理
$(window).load(
	function(){
		var $loginWayNode = $('#header .login .loginWay'),
			$phoneLoginNode = $loginWayNode.find('.phoneLogin')[0],
			$NetEaseMailLoginNode = $loginWayNode.find('.NetEaseMailLogin')[0],
			$telephoneNumberLoginBox = $('#telephoneNumberLogin'),
			$telephoneNumberLoginBoxHide = $telephoneNumberLoginBox.find('.loginCancel')[0];
			$NeteaseEmailLoginBox = $('#NeteaseEmailLogin');
			$NeteaseEmailLoginBoxhide = $NeteaseEmailLoginBox.find('.loginCancel')[0];
		$($phoneLoginNode).click(function(){
			$($telephoneNumberLoginBox).show();
		});
		$($telephoneNumberLoginBoxHide).click(function(){
			$($telephoneNumberLoginBox).hide();
		});
		$($NetEaseMailLoginNode).click(function(){
			$($NeteaseEmailLoginBox).show();
		});
		$($NeteaseEmailLoginBoxhide).click(function(){
			$($NeteaseEmailLoginBox).hide();
		});
	}
);
//回到顶部
$(window).load(
	function(){
		var $goTopNode = $('#goTop'),
			scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
		if(scrollTop>0){
			$($goTopNode).show();
		}
		$(window).scroll(
			function(){
				var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
				if(scrollTop > 0){
					$($goTopNode).show();
				} else{
					$($goTopNode).hide();
				}
			}
		);
		$($goTopNode).click(function(){		
			document.body.scrollTop ? (document.body.scrollTop = 0) : (document.documentElement.scrollTop = 0);
//			(document.body.scrollTop || document.documentElement.scrollTop) = 0;
		});
	}
);
