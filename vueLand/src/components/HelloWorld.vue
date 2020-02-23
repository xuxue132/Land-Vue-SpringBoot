<template>
  <div class="hello">
    <el-input v-model="land.name" placeholder="请输入内容"></el-input>
    <el-input placeholder="请输入密码" v-model="land.password" show-password></el-input>
    <el-button type="primary" @click="onSubmit">登陆</el-button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      land:{
        name:'',
        password:''
      }
    }
  },
  methods:{
    onSubmit(){
      const _this=this;
      this.$axios.post('http://localhost:8081/land',_this.land).then(function (re) {
        alert(re.data)
      })
    }
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.hello{
  margin: 0 auto;
  width: 300px;
}
</style>
