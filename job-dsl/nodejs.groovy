job ('nodejs job')
{
    scm {
        git ('https://github.com/Witek-K/node_altkom.git') { node ->
                node / gitConfigName('DSL script')
                node / gitConfigEmail('dslscript@jenkins.com')}
    }

    triggers {
        scm('H/5 * * * *')

    }

    wrappers {
        nodejs('nodejs')
    }

    steps {
        shell('node app.js')
    }
}