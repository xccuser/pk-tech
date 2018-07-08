import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import login from '@/components/login'
import register from '@/components/register'
import left from '@/components/left'

Vue.use(Router)

export default new Router({
  mode:"history",
  routes: [
  {
    path: '/',
    name: 'HelloWorld',
    component: HelloWorld
  },
  {
    path: '/login',
    name: 'login',
    component: login
  } ,
  {
    path: '/register',
    name: 'register',
    component: register
  },
  {
    path: '/left',
    name: 'asda',
    component: left
  }
  ]
})
