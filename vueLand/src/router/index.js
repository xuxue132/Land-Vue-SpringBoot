import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import insert from '../components/insert'
Vue.use(Router)

export default new Router({
  mode: "history",
  routes: [
    {
      path: '/',
      name: '登陆',
      component: HelloWorld
    },
    {
      path: '/insert',
      name:'注册',
      component:insert
    }
  ]
})
