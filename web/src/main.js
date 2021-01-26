import Vue from 'vue'
import App from './App.vue'
import router from './router'
import vuetify from './plugins/vuetify';
import '@mdi/font/css/materialdesignicons.css' // Ensure you are using css-loader
import * as VueGoogleMaps from 'vue2-google-maps'

Vue.config.productionTip = false

Vue.use(VueGoogleMaps, {
  load: {
    key: 'AIzaSyBPxD-WkWWhVNrrRCTSk2Rw38Xr9ptYdkQ',
    libraries: 'places'
  }
})

require('@/assets/css/style.scss')

new Vue({
  router,
  render: h => h(App),
  vuetify
}).$mount('#app')
