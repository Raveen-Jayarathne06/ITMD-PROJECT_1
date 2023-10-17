import { createRouter, createWebHistory } from 'vue-router'

import addData from '../components/Add.vue'
import viewData from '../components/View.vue'
import selectName from '../components/SelectName.vue'
import selectEmail from '../components/SelectEmail.vue'
import selectupdate from '../components/update.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/add/page',
      name: 'add',
      component: addData
    },
    {
      path: '/view/page',
      name: 'view',
      component: viewData
    },
    {
      path: '/selectName/page',
      name: 'selectName',
      component: selectName
    },
    {
      path: '/selectEmail/page',
      name: 'selectEmail',
      component: selectEmail
    },
    {
      path: '/selectupdate/page/:id',
      name: 'selectupdate',
      component: selectupdate
    },
  ]
})

export default router
