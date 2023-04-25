
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderingManager from "./components/listers/OrderingCards"
import OrderingDetail from "./components/listers/OrderingDetail"

import ShippingManager from "./components/listers/ShippingCards"
import ShippingDetail from "./components/listers/ShippingDetail"

import StockManager from "./components/listers/StockCards"
import StockDetail from "./components/listers/StockDetail"




export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderings',
                name: 'OrderingManager',
                component: OrderingManager
            },
            {
                path: '/orderings/:id',
                name: 'OrderingDetail',
                component: OrderingDetail
            },

            {
                path: '/shippings',
                name: 'ShippingManager',
                component: ShippingManager
            },
            {
                path: '/shippings/:id',
                name: 'ShippingDetail',
                component: ShippingDetail
            },

            {
                path: '/stocks',
                name: 'StockManager',
                component: StockManager
            },
            {
                path: '/stocks/:id',
                name: 'StockDetail',
                component: StockDetail
            },





    ]
})
