import './assets/main.css'
import './index.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import home from './components/Home.vue'

const app = createApp(App)

app.use(router)
app.component('homePage',home)

app.mount('#app')
