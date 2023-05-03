# Demo application for Azure AD Backend

The [front-end code](https://github.com/allthatjava/azure-login-angular) is on Github.

Main configuration is in SecurityConfig.java
```java
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and()
            .authorizeRequests()
                .antMatchers("/api/heroes")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/api/vigilante/*")
                .authenticated()
            .and()
            .oauth2ResourceServer()
            .jwt();
    }
```

Validate the Authorization by group claims in the controller entry,
```java
    @PreAuthorize("#authentication.tokenAttributes[@groupBean.getClaimField()].contains(@groupBean.getGroup1()) " +
            " || #authentication.tokenAttributes[@groupBean.getClaimField()].contains(@groupBean.getGroup2())")

```