import Vue from 'vue';
import Vuetify from 'vuetify/lib/framework';

Vue.use(Vuetify);

export default new Vuetify({
    theme: {
        themes: {
            light: {
                primary: '#3f51b5',
                secondary: '#ff7f00',
                accent: '#ffffff',
                error: '#b71c1c',
            },
        },
    },
    icons: {
        iconfont: 'mdiSvg'
    }
});
