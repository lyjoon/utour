import Vue from 'vue'
import Router from 'vue-router'

import HomePage from "../pages/HomePage";
import ProductPage from "../pages/ProductPage";
import ReviewPage from "../pages/ReviewPage";

import ProductList from "../components/product/ProductList";
import ProductView from "../components/product/Product";
import ReviewList from "../components/review/ReviewList";
import AppContainer from "../components/layout/AppContainer";

Vue.use(Router)

export default new Router({
  mode: 'history', //removes # (hashtag) from url
  routes: [
    {
      path: '*',
      redirect: '/'
    },
    {
      path: '/',
      component: AppContainer,
      children: [
        {
          path: '',
          component: HomePage
        },
        {
          path: '/product',
          component: ProductPage,
          children: [
            {
              path: 'list',
              component: ProductList
            },
            {
              path: ':id',
              component: ProductView
            },
          ]
        },
        {
          path: '/review',
          component: ReviewPage,
          children: [
            {
              path: 'list',
              component: ReviewList
            }
          ]
        }
      ]
    }
  ]
})
