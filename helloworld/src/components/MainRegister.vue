<template>
	
	<div style="background: #305081;margin-left:30%;margin-right:30%;margin-bottom: 10% ">


		<el-container>
			<el-header style="color:#fff">用户注册界面</el-header>
			<el-main style="font-size: 20px">



				<div style="margin-top:20px "></div>
				<div clss="app" style="margin:auto;width: 50% font-size:20px;color:#fff">
					手机号:<el-input v-model="phone" placeholder="请输入手机号" style="width: 40%;margin:10px;"></el-input><br>
					用户名:
					<el-input v-model="username" placeholder="用户名" style="width: 40%;margin:10px;"></el-input><br>
					&nbsp;密&nbsp;&nbsp;&nbsp;码:	
					<el-input v-model="password" placeholder="密码" style="width: 40%;margin:10px;"></el-input><br>
					&nbsp;姓&nbsp;&nbsp;&nbsp;名:
					<el-input v-model="name" placeholder="姓名" style="width: 40%;margin:10px;"></el-input><br>
					<el-button type="primary" @click="login" round style="background-color:#67c23a;  border-color:#67c23a;">注册</el-button>&nbsp;&nbsp;&nbsp;
					<el-button type="primary" @click="fanhui" round style="background-color:#67c23a;  border-color:#67c23a;">返回登陆</el-button>
				</div>


				


			</el-main>
		</el-container>






	</div>

</template>

<script>
	export default{
		data(){
			return {
				phone:'',
				password:"",
				username:"",
				name:""
			}
		},
		methods:{



		/*	function test(){
					//POST方法

					var params = new URLSearchParams();
					params.append('phone', this.phone);
					params.append('phone', this.phone);
					params.append('phone', this.phone);
					axios.post(url, params).then(function (response) {
						　　alert(''.concat(response.data, '\r\n', response.status, '\r\n', response.statusText, '\r\n', response.headers, '\r\n', response.config));
					}).catch(function (error) {
						　　alert(error);
					});

				}
				*/












				login(){
				/*	this.$axios.get('http://localhost:8080/register?phone='+this.phone+'&password='+this.password+"&username="+this.username+"&name="+this.name).then(respone=>{

						console.log(respone);
						if(respone.data.code=="0001"){
							this.$message({
								message:respone.data.msg,
								type:'success'
							});
							this.$router.push({path:'/'})
						}else{
							this.$message.error(respone.data.msg);
						}
					})*/

					this.$axios({
						method: 'post',
						url:'http://localhost:8080/register',
						params: {
							username:this.username,
							name:this.name,
							password:this.password,
							phone:this.phone
						}
					}).then((res)=>{

					


					})












				},
				fanhui(){
					javascript:history.back(-1);
				}

			}}





		</script>

		<style rel="stylesheet">
		.el-header{
			text-align: center;
			line-height: 118px;
		}
		body{
			background: #345e89
		}


	</style>