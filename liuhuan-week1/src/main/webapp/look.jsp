<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详情页</title>
<link rel="stylesheet" href="css/index3.css">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
</head>
<script type="text/javascript">
	$(function(){
		var gid=${param.gid};
		$.post("findGoodsById.do",{gid:gid},function(obj){
			$("[name=name]").val(obj.name);
			$("[name=bid]").val(obj.bname);
			$("[name=tid]").val(obj.cname);
			$("[name=datea]").val(obj.datea);
			$("[name=price]").val(obj.price);
			if(obj.status>0){
				$("[name=status]").val("已删除");
			}else{
				$("[name=status]").val("正常");
			}
		},"json")
	})
	
</script>
<body>
	<table>
		<tr>
			<td>商品名称</td>
			<td>
				<input type="text" name="name">
			</td>
		</tr>
		<tr>
			<td>品牌</td>
			<td>
				<input type="text" name="bid">
			</td>
		</tr>
		<tr>
			<td>分类</td>
			<td>
				<input type="text" name="tid">
			</td>
		</tr>
		<tr>
			<td>发布时间</td>
			<td>
				<input type="text" name="datea">
			</td>
		</tr>
		<tr>
			<td>价格</td>
			<td>
				<input type="text" name="price" >
				<input type="hidden" name="status" value="0">
			</td>
		</tr>
		<tr>
			<td>商品状态</td>
			<td>
				<input type="text" name="status">
			</td>
		</tr>
	</table>
</body>
</html>