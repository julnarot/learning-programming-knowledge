importScripts('js/sw-utils.js');

const STATIC_CACHE = 'static-v1';
const DINAMYC_CACHE = 'dynamic-v1';
const INMUTABLE_CACHE = 'inmutable-v1';

const APP_SHELL = [
    '/',
    'index.html',
    'style/base.css',
    'style/bg.png',
    'js/base.js',
    'js/app.js',
    'js/sw-utils.js',
];

const APP_SHELL_INMUTABLE = [
    'https://cdn.jsdelivr.net/npm/pouchdb@8.0.1/dist/pouchdb.min.js',
];

self.addEventListener('install', (event) => {
    const cacheStatic = caches
        .open(STATIC_CACHE)
        .then((cache) => cache.addAll(APP_SHELL));
    const cacheInmutable = caches
        .open(INMUTABLE_CACHE)
        .then((cache) => cache.addAll(APP_SHELL_INMUTABLE));

    event.waitUntil(Promise.all([cacheStatic, cacheInmutable]));
});

self.addEventListener('activate', (event) => {
    event.waitUntil(
        caches.keys().then((keys) => {
            keys.forEach((key) => {
                if (key !== STATIC_CACHE && key.includes('static')) {
                    return caches.delete(key);
                }
                if (key !== DINAMYC_CACHE && key.includes('dynamic')) {
                    return caches.delete(key);
                }
            });
        })
    );
});

self.addEventListener('fetch', (event) => {
    const cachesResp = caches.match(event.request).then((caches_) => {
        if (caches_) {
            return caches_;
        } else {
            return fetch(event.request).then((fResp) => {
                return updateDynamicCache(DINAMYC_CACHE, event.request, fResp);
            });
        }
    });
    event.respondWith(cachesResp);
});