export const environment = {
  production: true,
  baseHref: '/frontend/',
  authConfig: {
    issuer: 'http://authserver-1.dev-space.appsso.tap.h2o-4-13952.h2o.vmware.com',
    clientId: 'dev-space_client-registration',
    requireHttps: false
  },
  endpoints: {
    orders: window.location.origin + '/services/order-service/api/v1/orders',
    products: window.location.origin +  '/services/product-service/api/v1/products'
  }
};

