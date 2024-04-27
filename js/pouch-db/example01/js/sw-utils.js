function updateDynamicCache(dynamicCacheName, req, resp) {
    if (resp.ok) {
      return caches.open(dynamicCacheName).then((cache) => {
        cache.put(req, resp.clone());
        return resp.clone();
      });
    } else {
      return resp;
    }
  }