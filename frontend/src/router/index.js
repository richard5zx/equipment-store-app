import {createRouter, createWebHistory} from 'vue-router'

import RegisterUser from '@/components/RegisterUser.vue'
import LoginUser from '@/components/LoginUser.vue'

const routes = [
    {path:'/RegisterUser', component:RegisterUser},
    {path:'/LoginUser', component:LoginUser}
];

const router = createRouter({
    history:createWebHistory(),
    routes
});

export default router;