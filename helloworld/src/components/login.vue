<template>
	


	<div style="background: #305081;margin-left:35%;margin-right:35%;margin-bottom: 20% ">


		<el-container>
			<el-header style="color:#fff">用户登陆界面</el-header>
			<el-main style="font-size: 20px">
				<div style="margin-top:20px "></div>
				<div clss="app" style="margin:auto;width: 50% font-size:20px;color:#fff">
					手机号:<el-input v-model="phone" placeholder="请输入手机号" style="width: 40%;margin:10px;"></el-input><br>
					密&nbsp;&nbsp;&nbsp;&nbsp;码:
					<el-input v-model="password" placeholder="密码" style="width: 40%;margin:10px;"></el-input><br>
					<el-button type="primary" @click="login" round style="background-color:#67c23a;  border-color:#67c23a;">登陆</el-button>&nbsp;&nbsp;&nbsp;
					<el-button type="primary" @click="register" round style="background-color:#67c23a;  border-color:#67c23a;">注册</el-button>
				</div>
			</el-main>
		</el-container>






	</div>

</template>
<script type="text/javascript">
	export default{
		data(){
			return {
				phone:'',
				password:"",
			}
		},
		methods:{
			login(){
				this.$axios.get('http://localhost:8080/login?phone='+this.phone+'&password='+this.password).then(respone=>{
					console.log(respone.data.code);
					if(respone.data.code=="0000"){
						this.$message({
							message:respone.data.msg,
							type:'success'
						});
						this.$router.push({path:'/left'})
					}else{
						this.$message.error(respone.data.msg);
					}
				})
			},
			register(){
				this.$router.push({path:'register'})
			}

		}}
	</script>
	<style type="text/css">
	
	.el-header{
		text-align: center;
		line-height: 118px;
	}
	body{
		background: #345e89
	}
</style>
