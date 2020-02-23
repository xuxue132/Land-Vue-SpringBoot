<template>
  <div id="app">
    <div class="title">
      <el-menu router :default-active="activeIndex" class="el-menu-demo" mode="horizontal"  >
        <el-menu-item :key="index" :index="item.path" v-for="(item,index) in $router.options.routes">{{item.name}}</el-menu-item>
      </el-menu>
    </div>

    <div style="height: 20px"></div>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
  data(){
    return {
      activeIndex: '1',
      activeIndex2: '1'
    };
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
  .title{
    margin:0 auto;
    width: 500px;
  }
</style>
