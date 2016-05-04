<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style>
body {
	width: 880px;
	margin-left: auto;
	margin-right: auto;
	background: #F3F3F3;
}

.login-joinbox {
	font: status-bar;
	margin-right: 25px;
	min-height: 350px;
	width: 370px;
	background-color: white;
	left: 100px;
	float: left;
	border-style: solid;
	border-width: 1px;
	border-color: #C9C9C9;
	padding: 15px;
}

.login-loginbox {
	font: status-bar; 
	min-height: 350px;
	width: 370px;
	background-color: white;
	left: 100px;
	float: left;
	border-style: solid;
	border-width: 1px;
	border-color: #C9C9C9;
	padding: 15px;
}

.login-submit {
	padding: 20px;
	align: center;
}

.login-joinbox-content {
	margin-left: auto;
	margin-right: auto;
}

#hover:HOVER {
	color: red;
}

</style>

</head>
<body>
	<div id="container-simple">


	<h1 class="header-logo">
		<a href="http://www.coupang.com"> <img
			src="//mimgs.coupangcdn.com/image/static/my/logo-copuang-140925.png"
			width="113" height="25" alt="coupang">
		</a>
	</h1>



	<div class="login-joinbox">
		<h1 class="login-joinbox-title">신규회원</h1>
		<div class="login-joinbox-content">
			<strong>쿠팡회원</strong>이 되시면 <strong>놀라운 가격 할인</strong>이 여러분을 기다립니다!
		</div>
		<div class="login-joinbox-foot">
			<a class="login-joinbox-link"
				href="/login/memberJoinFrm.pang?rtnUrl=http%3A%2F%2Fwww.coupang.com%2Fnp%2Fpost%2Flogin%3Fr%3Dhttp%253A%252F%252Fwww.coupang.com%252F">회원가입</a>
		</div>
	</div>




	<div class="login-loginbox">
		<h1 class="login-title">로그인</h1>
		<div class="login-form">
			<form name="loginForm" id="loginForm"
				action="/login/loginProcess.pang" method="post">

				<div class="login-email">
					<label class="login-item"> <span class="login-label">아이디(이메일)</span>
						</br> <input class="login-tf ui-autocomplete-input" data-type="email"
						id="login-tf-email" name="email" type="text"
						placeholder="id@example.com" value="" autocomplete="off">
					</label>
				</div>
				<div class="login-password">
					<label class="login-item"> <span class="login-label">비밀번호</span></br>
						<input class="login-tf" data-err-target="login-errmsg"
						data-err-msg="비밀번호를 입력해주세요" id="login-tf-password" name="password"
						type="password" placeholder="비밀번호">
					</label>
					<div class="login-captcha" style="display: none;">
						<div class="login-captcha-notice">
							정보보호를 위해 자동입력 방지문자를 함께<br>입력하셔야 합니다.
						</div>
						<div class="login-captcha-box">
							<img class="login-captcha-image" id="login-captcha-image" src=""
								width="219" height="64"> <span class="login-captcha-util">




								<button type="button" class="login-captcha-refresh-btn"
									id="login-captcha-refresh">
									<i class="icon-refresh"></i> <span>새로고침</span>
								</button>
							</span>
						</div>
						<input class="login-tf" data-err-target="login-errmsg"
							data-err-msg="자동입력 방지문자를 입력해주세요" id="login-tf-captcha"
							name="captchaAnswer" type="text" placeholder="자동입력 방지문자">
					</div>
					<label class="login-password-menu"> </br> <input
						class="login-check-remember" id="login-check-remember"
						name="rememberMe" type="checkbox"> <span>로그인 상태 유지</span>
					</label>
					<div id="login-remember-msg" class="login-remember-msg">
						</br> </br> 개인정보 보호를 위해 <strong>개인PC</strong>에서만 이용해 주세요 <i
							class="login-remember-msg-tail"></i> <i
							class="login-remember-msg-tail-inner"></i>
					</div>
				</div>
				<div class="login-errmsg" id="login-errmsg" align="center"></div>
				<div class="login-form-foot">
					<button class="login-submit" id="login-submit" type="submit">로그인</button>
				</div>
			</form>
		</div>
		<div class="login-foot">
			<div class="login-find">
				<a id="hover" href="/login/accountInfoFind.pang" style="text-decoration: none" >아이디 찾기</a> 
				<span> | </span> 
				<a id="hover" href="/login/findPassword.pang" style="text-decoration: none" >비밀번호 찾기</a> 
				<span class="login-join-msg">쿠팡회원이 아니세요?</span> 
				<a id="hover" href="/login/memberJoinFrm.pang?rtnUrl=http%3A%2F%2Fwww.coupang.com%2Fnp%2Fpost%2Flogin%3Fr%3Dhttp%253A%252F%252Fwww.coupang.com%252F" style="text-decoration: none" >회원가입</a>
			</div>

		</div>
	</div>
	
	
	</div>
</body>
</html>
