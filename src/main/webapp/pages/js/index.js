//index.html轮播
$(window).load(function() {

	var $bannerWrapperNode = $('#content #banner .bannerWrapper'),
		$bannerImgs = $bannerWrapperNode.find('.bannerIterms img'),
		$bannnerSelectItems = $bannerWrapperNode.find('.bannerItermsSelect a'),
		$bannerLastnode = $bannerWrapperNode.find('.bannerLast')[0],
		$bannerNextNode = $bannerWrapperNode.find('.bannerNext')[0];

	var bannerImgAttr = 'dataimg',
		bannerSelectAttr = 'index',
		bannerImgsLen = $bannerImgs.length,
		bannnerSelectItemLen = $bannnerSelectItems.length;

	for(var i = 0; i < bannerImgsLen; i++) {
		$($bannerImgs[i]).attr(bannerImgAttr, i);
	}
	
	//改变图片和按钮的工具函数
	function change(imgNode, selectItemNode, i) {
		$(selectItemNode).addClass('click');
		for(var j = 0; j < bannnerSelectItemLen; j++) {
			if(j != i) {
				$($bannnerSelectItems[j]).removeClass('click');
			}
		}
		$(imgNode).show();
		for(var j = 0; j < bannerImgsLen; j++) {
			if(j != i) {
				$($bannerImgs[j]).hide();
			}
		}
		
	}

	//给轮播按钮添加点击事件
	for(var i = 0; i < bannnerSelectItemLen; i++) {
		$($bannnerSelectItems[i]).attr(bannerSelectAttr, i);
		(function(i) {
			var bannerImgAttrKv = '[' + bannerImgAttr + '=' + i + ']';
			$($bannnerSelectItems[i]).click(function() {
				imgNode = $($bannerWrapperNode).find(bannerImgAttrKv);
				change(imgNode, $(this), i);
			});
		})(i);
	}

	//轮播自动滚动
	var i = Math.floor((Math.random() * bannerImgsLen)),
		bannerImgAttrKv = '[' + bannerImgAttr + '=' + i + ']',
		bannerSelectAttrKv = '[' + bannerSelectAttr + '=' + i + ']',
		$bannerImg = $bannerWrapperNode.find(bannerImgAttrKv),
		$bannerSelectItem = $bannerWrapperNode.find(bannerSelectAttrKv);
	change($bannerImg, $bannerSelectItem, i);
	
	
	function autoChange() {
		if(i >= bannerImgsLen || i >= bannerSelectAttr){
			i = 0;
		}
		bannerImgAttrKv = '[' + bannerImgAttr + '=' + i + ']';
		$bannerImg = $bannerWrapperNode.find(bannerImgAttrKv);
		bannerSelectAttrKv = '[' + bannerSelectAttr + '=' + i + ']';
		$bannerSelectItem = $bannerWrapperNode.find(bannerSelectAttrKv);
		change($bannerImg, $bannerSelectItem, i);
		i++;
		setTimeout(autoChange, 5000);
	}
	autoChange();
	
	//轮播左右滚动
	$($bannerLastnode).click(function(){
		i = i - 1;
		if (i < 0) {
			i = (bannerImgsLen-bannnerSelectItemLen < 0) ? (bannerImgsLen-1): (bannnerSelectItemLen-1);
		}
		bannerImgAttrKv = '[' + bannerImgAttr + '=' + i + ']',
		bannerSelectAttrKv = '[' + bannerSelectAttr + '=' + i + ']',
		$bannerImg = $bannerWrapperNode.find(bannerImgAttrKv),
		$bannerSelectItem = $bannerWrapperNode.find(bannerSelectAttrKv);
		change($bannerImg, $bannerSelectItem, i);
	});
	
	$($bannerNextNode).click(function(){
		i = i + 1;
		if (i >= bannerImgsLen || i >= bannnerSelectItemLen) {
			i = 0;
		}
		bannerImgAttrKv = '[' + bannerImgAttr + '=' + i + ']',
		bannerSelectAttrKv = '[' + bannerSelectAttr + '=' + i + ']',
		$bannerImg = $bannerWrapperNode.find(bannerImgAttrKv),
		$bannerSelectItem = $bannerWrapperNode.find(bannerSelectAttrKv);
		change($bannerImg, $bannerSelectItem, i);
	});
});